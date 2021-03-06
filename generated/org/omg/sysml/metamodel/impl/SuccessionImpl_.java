package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SuccessionImpl.class)
public abstract class SuccessionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<SuccessionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<SuccessionImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<SuccessionImpl, Element> source;
	public static volatile CollectionAttribute<SuccessionImpl, Type> type;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> output;
	public static volatile CollectionAttribute<SuccessionImpl, Expression> guardExpression;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<SuccessionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<SuccessionImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<SuccessionImpl, UUID> identifier;
	public static volatile CollectionAttribute<SuccessionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<SuccessionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<SuccessionImpl, Association> ownedAssociationType;
	public static volatile CollectionAttribute<SuccessionImpl, Type> referencedType;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> input;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isComposite;
	public static volatile ListAttribute<SuccessionImpl, Element> relatedElement;
	public static volatile CollectionAttribute<SuccessionImpl, Type> ownedType;
	public static volatile CollectionAttribute<SuccessionImpl, Step> effectStep;
	public static volatile SingularAttribute<SuccessionImpl, String> name;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> connectorEnd;
	public static volatile ListAttribute<SuccessionImpl, Element> ownedMember;
	public static volatile ListAttribute<SuccessionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<SuccessionImpl, Association> association;
	public static volatile ListAttribute<SuccessionImpl, Membership> membership;
	public static volatile ListAttribute<SuccessionImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<SuccessionImpl, Step> triggerStep;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> targetFeature;
	public static volatile CollectionAttribute<SuccessionImpl, FeatureTyping> ownedTyping;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> feature;
	public static volatile ListAttribute<SuccessionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<SuccessionImpl, Element> member;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SuccessionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<SuccessionImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<SuccessionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<SuccessionImpl, Element> ownedElement;
	public static volatile ListAttribute<SuccessionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<SuccessionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<SuccessionImpl, Import> ownedImport;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isAbstract;
	public static volatile ListAttribute<SuccessionImpl, Feature> relatedFeature;
	public static volatile ListAttribute<SuccessionImpl, Element> target;
	public static volatile CollectionAttribute<SuccessionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<SuccessionImpl, Boolean> isDirected;
	public static volatile SingularAttribute<SuccessionImpl, String> humanId;
	public static volatile CollectionAttribute<SuccessionImpl, String> aliasId;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String GUARD_EXPRESSION = "guardExpression";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_ASSOCIATION_TYPE = "ownedAssociationType";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_END = "isEnd";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String OWNED_TYPE = "ownedType";
	public static final String EFFECT_STEP = "effectStep";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String ASSOCIATION = "association";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String TRIGGER_STEP = "triggerStep";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String IS_DIRECTED = "isDirected";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";

}

