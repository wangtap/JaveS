package homework.category.service;

import homework.category.dao.CategoryDao;
import homework.category.domain.Category;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.util.List;

public class ClassificationQuery {
    public static List<Category> showAllCategory(){
        CategoryDao categoryDao=new CategoryDao();
        List<Category> categories = categoryDao.queryAll();
        return categories;

    }

}
