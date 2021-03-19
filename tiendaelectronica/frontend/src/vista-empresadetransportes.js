import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaEmpresadetransportes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="header" style="width: 100%;">
  <vaadin-button theme="icon" aria-label="log-out" id="log-out-button">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-tab id="vaadinTab" style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="inicio-button">
   Inicio
  </vaadin-button>
  <vaadin-tab id="vaadinTab1" style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button theme="icon" aria-label="reload" id="reload-button">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-empresadetransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresadetransportes.is, VistaEmpresadetransportes);
