public class ComplNum {
    private double re, im;  //действительная и мнимая часть комплексного числа

    public ComplNum() {
    }

    public ComplNum(double r) {
        re = r;
    }

    public ComplNum(double re, double im) {
        this.re = re;
        this.im = im;
    }

    private double re() //действительная часть
    {
        return re;
    }
    private double im()  // мнимая часть
    {
        return im;
    }

    public double abs()  //абсолютная величина комплексного числа(Модуль)
    {
        return Math.sqrt(re*re + im*im);
    }
    public double arg()  //Аргумент
    {
        return (re!=0 || im!=0)? Math.atan2(im,re):0;
    }
    public ComplNum set(double r, double i)
    {
        re = r; im=i;
        return this;
    }
    public ComplNum setRe(double r)
    {
        re=r;
        return this;
    }
    public ComplNum setIm(double i)
    {
        im = i;
        return this;
    }
    public ComplNum set(ComplNum z)
    {
        re=z.re; im=z.im;
        return this;
    }
    public ComplNum conjugate()  //сопряжённое число
    {
        return new ComplNum(re,-im);
    }
    public ComplNum add(ComplNum b)   //a + b
    {
        return new ComplNum(re + b.re, im + b.im);
    }
    public ComplNum subt(ComplNum b)
    {
        return new ComplNum(re - b.re, im - b.im);
    }
    public ComplNum multip(ComplNum b)              // a * b
    { return new ComplNum(re*b.re-im*b.im, im*b.re+re*b.im); }

    public ComplNum div(ComplNum b) {            // a / b
        double c = b.re*b.re + b.im*b.im;
        return new ComplNum((re*b.re+im*b.im)/c, (im*b.re-re*b.im)/c);
    }

    public static ComplNum exp(ComplNum a) {          // exp(a)
        double abs = Math.exp(a.re), arg = a.im;
        return new ComplNum(abs*Math.cos(arg), abs*Math.sin(arg));
    }

    public static ComplNum log(ComplNum a)            // log(a)
    { return new ComplNum(Math.log(a.abs()), a.arg()); }

    public static ComplNum pow(ComplNum a, ComplNum b)  // pow(a, b)
    { return ComplNum.exp(b.multip(ComplNum.log(a))); }

    public String toString()
    {
       // return String.format("(%.2f,%.2f)", re, im);
        if(this.im<0)
            return this.re+"-"+(-this.im)+"i";
        return this.re + "+"+this.im +"i";
    }




}
