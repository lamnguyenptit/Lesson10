import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetDemo {
        enum days{
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }
        public static void main(String[] args) {
            Set<days> set = EnumSet.of(days.MONDAY, days.TUESDAY, days.FRIDAY);
            Iterator<days> itr = set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
}
