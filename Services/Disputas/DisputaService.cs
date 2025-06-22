using System.Threading.Tasks;
using AppRpgEtec.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections.ObjectModel;

namespace AppRpgEtec.Services.Disputas
{
    public class DisputaService : Request
    {
        private readonly Request _request;
        private string _token;

        //xyz --> site da sua API
        private const string _apiUrlBase = "http://luizsousa.somee.com/RpgApi/Disputas";

        public DisputaService(string token)
        {
            _request = new Request();
            _token = token;
        }

        public async Task<Disputa> PostDisputaComArmaAsync(Disputa d)
        {
            string urlComplementar = "/Arma";
            return await _request.PostAsync(_apiUrlBase + urlComplementar, d, _token);
        }

        public async Task<Disputa> PostDisputaComHabilidadesAsync(Disputa d)
        {
            string urlComplementar = "/Habilidade";
            return await _request.PostAsync(_apiUrlBase + urlComplementar, d, _token);
        }

        public async Task<Disputa> PostDisputaGeralAsync(Disputa d)
        {
            string urlComplementar = "/DisputaEmGrupo";
            return await _request.PostAsync(_apiUrlBase + urlComplementar, d, _token);
        }

        public async Task<ObservableCollection<PersonagemHabilidade>> GetPersonagemHabilidadesAsync(int personagemId)
        {
            string urlComplementar = string.Format("/{0}", personagemId);
            ObservableCollection<PersonagemHabilidade> listaPH = await _request.GetAsync<ObservableCollection<PersonagemHabilidade>>(_apiUrlBase + urlComplementar, _token);
            return listaPH;
        }

        public async Task<ObservableCollection<Habilidade>> GetHabilidadesAsync()
        {
            string urlComplementar = string.Format("/{0}", "GetHabilidades");

            ObservableCollection<Habilidade> listaHabilidades = await
                _request.GetAsync<ObservableCollection<Habilidade>>(_apiUrlBase + urlComplementar, _token);
            return listaHabilidades;
        }
    }
}
