import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEmpresadetransportes extends PolymerElement {

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
 <vaadin-horizontal-layout id="header" style="width: 100%;">
  <vaadin-button id="log-out-button">
   Salir
  </vaadin-button>
  <vaadin-tab id="vaadinTab" style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="inicio-button">
    Inicio 
  </vaadin-button>
  <vaadin-tab id="vaadinTab1" style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button theme="primary" id="reload-button">
   Recargar
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
