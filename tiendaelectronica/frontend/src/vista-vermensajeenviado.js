import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vermensajeenviado`
 *
 * VistaVermensajeenviado element.
 *
 * @customElement
 * @polymer
 */
class VistaVermensajeenviado extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
