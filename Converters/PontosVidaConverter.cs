using System;
using System.Globalization;
using Microsoft.Maui.Controls;
using Microsoft.Maui.Graphics.Converters;

namespace AppRpgEtec.Converters
{
    public class PontosVidaConverter : IValueConverter
    {
        public object? Convert(object? value, Type targetType, object? parameter, CultureInfo culture)
        {
            ColorTypeConverter converter = new ColorTypeConverter();

            int pontosVida = value is int pv ? pv : 0;
            object? cor = null;
            if (pontosVida == 100)
                cor = converter.ConvertFromInvariantString("SeaGreen");
            else if (pontosVida >= 75)
                cor = converter.ConvertFromInvariantString("YellowGreen");
            else if (pontosVida >= 25)
                cor = converter.ConvertFromInvariantString("Yellow");
            else if (pontosVida >= 1)
                cor = converter.ConvertFromInvariantString("OrangeRed");
            else
                cor = converter.ConvertFromInvariantString("Red");
            return cor;
        }

        public object? ConvertBack(object? value, Type targetType, object? parameter, CultureInfo culture)
        {
            throw new NotImplementedException();
        }
    }
}
