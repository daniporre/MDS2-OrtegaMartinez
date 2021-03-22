import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaVercuentausuarioregistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="width: 100%;">
  <vaadin-button id="inicio-button">
    Inicio 
  </vaadin-button>
  <vaadin-text-field placeholder="Search" style="width: 40%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button theme="icon" aria-label="Add new">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="carrito-button">
    Carrito 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
  <vaadin-button id="logout-button">
    Cerrar sesión 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; margin: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <h3>Dirección de entrega</h3>
    <vaadin-text-field label="Calle" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Código postal" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Ciudad" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Provincia" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
     <vaadin-button id="vaadinButton1">
       Editar 
     </vaadin-button>
     <vaadin-button id="vaadinButton" style="flex-grow: 0; flex-shrink: 1;">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="flex-grow: 1;">
    <h3>Tarjeta bancaria</h3>
    <vaadin-text-field label="Fecha de vencimiento" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="CVS" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
     <vaadin-button>
       Editar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; flex-shrink: 1;">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <h3>Datos personales </h3>
    <vaadin-text-field label="Nombre" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Email" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
     <vaadin-button>
       Editar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; flex-shrink: 1;">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <label>Label</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercuentausuarioregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercuentausuarioregistrado.is, VistaVercuentausuarioregistrado);
