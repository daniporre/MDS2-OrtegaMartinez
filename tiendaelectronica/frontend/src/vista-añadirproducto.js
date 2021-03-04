import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-añadirproducto`
 *
 * VistaAñadirproducto element.
 *
 * @customElement
 * @polymer
 */
class VistaAñadirproducto extends PolymerElement {

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
        return 'vista-añadirproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAñadirproducto.is, VistaAñadirproducto);
