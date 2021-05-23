import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaVermensajeenviado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-end; justify-content: flex-start;">
 <vaadin-tab style="height: 15%;"></vaadin-tab>
 <h2 style="align-self: center; width: 45%;">Ver mensaje enviado</h2>
 <vaadin-text-field label="Asunto" id="asuntoTF" style="align-self: center; width: 45%;" readonly></vaadin-text-field>
 <vaadin-text-area label="Mensaje" id="mensajeTF" style="align-self: center; width: 45%;" readonly></vaadin-text-area>
 <vaadin-button id="aceptarButton" style="width: 45%; align-self: center;">
  Aceptar
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vermensajeenviado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVermensajeenviado.is, VistaVermensajeenviado);
