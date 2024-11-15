package ma.znagui.easyline.validator;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ma.znagui.easyline.exception.ResourceNotFoundException;

public class CheckExistingValidator  implements ConstraintValidator<CheckExisting,Long> {

    @PersistenceContext
    private EntityManager entityManager;

    private Class<?> entityC;

    @Override
    public void initialize(CheckExisting constraintAnnotation) {
        this.entityC = constraintAnnotation.entityC();
    }

    public boolean isValid(Long aLong, ConstraintValidatorContext constraintValidatorContext) {
        if (aLong == null){
            return false;

        }
        Long count = (Long) entityManager.createQuery("SELECT COUNT(*) FROM " + entityC.getSimpleName() + " e WHERE e.id = :id ").setParameter("id",aLong).getSingleResult();

        if(count == 0){
            throw new ResourceNotFoundException(entityC.getSimpleName(),aLong);
        }
        return true;
    }
}
