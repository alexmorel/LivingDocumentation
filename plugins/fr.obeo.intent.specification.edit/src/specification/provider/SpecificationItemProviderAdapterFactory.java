/**
 */
package specification.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import specification.util.SpecificationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationItemProviderAdapterFactory extends SpecificationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Specification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationItemProvider specificationItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Specification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecificationAdapter() {
		if (specificationItemProvider == null) {
			specificationItemProvider = new SpecificationItemProvider(this);
		}

		return specificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Capability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityItemProvider capabilityItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityAdapter() {
		if (capabilityItemProvider == null) {
			capabilityItemProvider = new CapabilityItemProvider(this);
		}

		return capabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Benefit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenefitItemProvider benefitItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Benefit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBenefitAdapter() {
		if (benefitItemProvider == null) {
			benefitItemProvider = new BenefitItemProvider(this);
		}

		return benefitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Story} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryItemProvider storyItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Story}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoryAdapter() {
		if (storyItemProvider == null) {
			storyItemProvider = new StoryItemProvider(this);
		}

		return storyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Scenario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioItemProvider scenarioItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenarioAdapter() {
		if (scenarioItemProvider == null) {
			scenarioItemProvider = new ScenarioItemProvider(this);
		}

		return scenarioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Behaviour} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourItemProvider behaviourItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviourAdapter() {
		if (behaviourItemProvider == null) {
			behaviourItemProvider = new BehaviourItemProvider(this);
		}

		return behaviourItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.AutomationLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomationLayerItemProvider automationLayerItemProvider;

	/**
	 * This creates an adapter for a {@link specification.AutomationLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAutomationLayerAdapter() {
		if (automationLayerItemProvider == null) {
			automationLayerItemProvider = new AutomationLayerItemProvider(this);
		}

		return automationLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.ImplementationNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationNoteItemProvider implementationNoteItemProvider;

	/**
	 * This creates an adapter for a {@link specification.ImplementationNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementationNoteAdapter() {
		if (implementationNoteItemProvider == null) {
			implementationNoteItemProvider = new ImplementationNoteItemProvider(this);
		}

		return implementationNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.TestNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestNoteItemProvider testNoteItemProvider;

	/**
	 * This creates an adapter for a {@link specification.TestNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestNoteAdapter() {
		if (testNoteItemProvider == null) {
			testNoteItemProvider = new TestNoteItemProvider(this);
		}

		return testNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.ScenarioElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioElementItemProvider scenarioElementItemProvider;

	/**
	 * This creates an adapter for a {@link specification.ScenarioElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenarioElementAdapter() {
		if (scenarioElementItemProvider == null) {
			scenarioElementItemProvider = new ScenarioElementItemProvider(this);
		}

		return scenarioElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link specification.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link specification.TestGenerationNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestGenerationNoteItemProvider testGenerationNoteItemProvider;

	/**
	 * This creates an adapter for a {@link specification.TestGenerationNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestGenerationNoteAdapter() {
		if (testGenerationNoteItemProvider == null) {
			testGenerationNoteItemProvider = new TestGenerationNoteItemProvider(this);
		}

		return testGenerationNoteItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (specificationItemProvider != null) specificationItemProvider.dispose();
		if (featureItemProvider != null) featureItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (capabilityItemProvider != null) capabilityItemProvider.dispose();
		if (benefitItemProvider != null) benefitItemProvider.dispose();
		if (storyItemProvider != null) storyItemProvider.dispose();
		if (scenarioItemProvider != null) scenarioItemProvider.dispose();
		if (contextItemProvider != null) contextItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (behaviourItemProvider != null) behaviourItemProvider.dispose();
		if (automationLayerItemProvider != null) automationLayerItemProvider.dispose();
		if (implementationNoteItemProvider != null) implementationNoteItemProvider.dispose();
		if (testNoteItemProvider != null) testNoteItemProvider.dispose();
		if (scenarioElementItemProvider != null) scenarioElementItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (testGenerationNoteItemProvider != null) testGenerationNoteItemProvider.dispose();
	}

}
