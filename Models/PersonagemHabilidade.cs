using System;

namespace AppRpgEtec.Models
{
    public class PersonagemHabilidade
    {
        public int PersonagemId { get; set; }
        public Personagem Personagem { get; set; }
        public int HabilidadeId { get; set; }
        public Habilidade Habilidade { get; set; }
        public string HabilidadeNome
        {
            get { return Habilidade.Nome; }
        }
    }
}
