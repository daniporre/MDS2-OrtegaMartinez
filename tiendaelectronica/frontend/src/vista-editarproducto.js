import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaEditarproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);" id="vaadinHorizontalLayout">
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto; flex-direction: column;" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; margin: var(--lumo-space-l); flex-shrink: 1; flex-direction: row;" id="vaadinVerticalLayout1">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; margin: var(--lumo-space-m); flex-shrink: 1; align-self: stretch; width: 35%;" id="vaadinVerticalLayout2">
    <img id="foto1Image" style="width: 100%; height: 100%; flex-shrink: 1;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0;" id="vaadinHorizontalLayout2">
     <vaadin-button id="foto2Image">
       imagen1 
     </vaadin-button>
     <vaadin-button id="foto3Image">
       imagen3 
     </vaadin-button>
     <vaadin-button id="foto4Image">
       imagen4 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-tab id="vaadinTab"></vaadin-tab>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: stretch; width: 50%;" id="vaadinVerticalLayout3">
    <vaadin-text-field label="Nombre del producto" id="nombreProductoTF"></vaadin-text-field>
    <vaadin-text-field label="Precio del producto en euros" id="precioProductoTF"></vaadin-text-field>
    <vaadin-text-field label="Marca del producto" id="marcaProductoTF"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: space-between;" id="vaadinHorizontalLayout3">
     <h2 style="flex-shrink: 0; flex-grow: 1; width: 45%;" id="h2">Oferta</h2>
     <vaadin-combo-box id="ofertasProductoTF" style="flex-grow: 1; align-self: center;"></vaadin-combo-box>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <h2 style="flex-grow: 1; width: 45%;">Asignar categoría</h2>
     <vaadin-combo-box id="categoriaProductoComboBox" style="align-self: center; flex-grow: 1;"></vaadin-combo-box>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <h3 style="align-self: center;">Categorías a las que pertenece:</h3>
     <vaadin-horizontal-layout theme="spacing" id="categoriasLayout" style="align-self: center; flex-grow: 1;"></vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-l);" id="vaadinVerticalLayout4">
   <vaadin-text-area label="Descripcion del producto" placeholder="A�ade una descripci�n detallada del producto." id="descripcionProductoTF" style="align-self: stretch;"></vaadin-text-area>
   <vaadin-button theme="primary" style="align-self: flex-end;" id="guardarCambiosButton">
     Guardar cambios 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-editarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditarproducto.is, VistaEditarproducto);
