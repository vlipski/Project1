package Task11_Regex;

public class FindTag {
    public static void main(String[] args) {

        String str = "<P id= gf><p jkjhhk><DEL>Добрый день, <EM>Уважаемые слушатели</EM></DEL>! Сегодня мы с вами будем \n" +
                "            рассматривать структуру стандартного <STRONG>HTML</STRONG> файла.</P>\n" +
                "            <P id=hg>Далее мы будем использовать произвольный текст для наполнения контентом. Не стоит\n" +
                "            вдумываться в его содержание.</P>\n" +
                "            <P id = yr>«Си́мпсоны» (англ. The Simpsons) — самый длинный мультсериал в истории американского\n" +
                "            телевидения, длящийся 25 сезонов. Первая мини-серия «Good night» была показана в\n" +
                "            «Шоу Трейси Ульман» 19 апреля 1987 года.</P>";

        System.out.println(str.replaceAll("<[Pp].+?>","<P>"));
    }
}
