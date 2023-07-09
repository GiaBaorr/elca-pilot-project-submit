package vn.elca.training.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectEmployee is a Querydsl query type for ProjectEmployee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProjectEmployee extends EntityPathBase<ProjectEmployee> {

    private static final long serialVersionUID = -2051414334L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectEmployee projectEmployee = new QProjectEmployee("projectEmployee");

    public final QEmployee employee;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QProject project;

    public QProjectEmployee(String variable) {
        this(ProjectEmployee.class, forVariable(variable), INITS);
    }

    public QProjectEmployee(Path<? extends ProjectEmployee> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectEmployee(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectEmployee(PathMetadata metadata, PathInits inits) {
        this(ProjectEmployee.class, metadata, inits);
    }

    public QProjectEmployee(Class<? extends ProjectEmployee> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project"), inits.get("project")) : null;
    }

}

