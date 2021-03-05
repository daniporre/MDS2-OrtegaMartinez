import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaMensajesenviados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
  <vaadin-tab></vaadin-tab>
  <label>Cuerpo del mensaje</label>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <label>Asunto</label>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <label>Fecha</label>
  <vaadin-tab></vaadin-tab>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mensajesenviados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensajesenviados.is, VistaMensajesenviados);
