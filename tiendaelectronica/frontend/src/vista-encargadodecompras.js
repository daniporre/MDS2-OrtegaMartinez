import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaEncargadodecompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="header" style="width: 100%;">
  <vaadin-button theme="icon" aria-label="Add new" id="inicio-button">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-tab id="vaadinTab" style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="reload-button">
   Actualizar lista de compras
  </vaadin-button>
  <vaadin-tab id="vaadinTab1" style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="logout-button">
   Cerrar sesión
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="listadecompras-layout" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-encargadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadodecompras.is, VistaEncargadodecompras);
