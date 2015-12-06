public class CBook 
{
	 CMetha ThisMetha = new CMetha();
	    public int PageNumber(double FontSize, int WindowX, int WindowY, String Text)
	    {
	        int Number=0;
	        return Number;
	    }

	    String Title;
	    String Text;
	   public void WriteMetha(String Title,  String Author,   String Publisher, String Font, double FontSize, int ISBN)
	   {
	        this.ThisMetha.Author=Author;
	        this.ThisMetha.Title=Title;
	        this.ThisMetha.Publisher=Publisher;
	        this.ThisMetha.Font=Font;
	        this.ThisMetha.FontSize=FontSize;
	        this.ThisMetha.ISBN=ISBN;
	    }
	    public void ReadMetha()
	    {
	        System.out.println("Autor: "+this.ThisMetha.Author);
	        System.out.println("Titel: "+this.ThisMetha.Title);
	        System.out.println("Verlag: "+this.ThisMetha.Publisher);
	        System.out.println("Schriftart: "+this.ThisMetha.Font);
	        System.out.println("Schriftgroesse: "+this.ThisMetha.FontSize);
	        System.out.println("ISBN: "+this.ThisMetha.ISBN);

	    }
}
