package homework9;

public class Main {

    public static <CollectionFamilyDAO> void main(String[] args) {
//        FamilyDao fams = new FamilyDao() {
//            @Override
//            public List<homework9.Family> getAllFamilies() {
//                return null;
//            }
//
//            @Override
//            public homework9.Family getFamilyByIndex(int index) {
//                return null;
//            }
//
//            @Override
//            public Boolean deleteFamily(int index) {
//                return null;
//            }
//
//            @Override
//            public Boolean deleteFamily(homework9.Family f) {
//                return null;
//            }
//
//            @Override
//            public List<homework9.Family> saveFamily(Family f) {
//                return null;
//            }
//        };
//        homework9.FamilyService fs = new FamilyService(new CollectionFamilyDao());
//        homework9.FamilyController fc = new FamilyController(fs);
//
//        fs.createNewFamily(new homework9.Human("Allahverdi","Hajiyev"),new homework9.Human("Allahverdi","Hajiyev"));
//        System.out.println(fs.getAllFamilies());
//        System.out.println(fs.count());
//        System.out.println(fs.displayAllFamilies());
//        System.out.println(fs.getPets(0));
//        System.out.println(fs.getFamiliesLessThan(2));
//        System.out.println(fs.getFamiliesBiggerThan(1));
//        fs.createNewFamily(new homework9.Human("Allahverdi2","Hajiyev"),new Human("Allahverdi2","Hajiyev"));
//        System.out.println(fs.getAllFamilies());
//
//        System.out.println(fs.count());

        Human h = new Human("sasas","daasas", 1322018752992l, 10);

        System.out.println(h.toString());

        System.out.println(h.describeAge(1322018752992l));

    }
}
