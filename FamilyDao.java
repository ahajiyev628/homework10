package homework9;

import java.util.List;

public interface FamilyDao {
    List<homework9.Family> getAllFamilies();
    homework9.Family getFamilyByIndex(int index);
    Boolean deleteFamily(int index);
    Boolean deleteFamily(homework9.Family f);
    List<homework9.Family> saveFamily(Family f);
}
