package homework10.Dao;
import homework10.App.Family;

import java.util.List;
public interface FamilyDao {
    List<Family> getAllFamilies() ;

    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    void saveFamily(Family family);
}
