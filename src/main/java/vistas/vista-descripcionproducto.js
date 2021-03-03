import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-descripcionproducto`
 *
 * VistaDescripcionproducto element.
 *
 * @customElement
 * @polymer
 */
class VistaDescripcionproducto extends PolymerElement {

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
        return 'vista-descripcionproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDescripcionproducto.is, VistaDescripcionproducto);
