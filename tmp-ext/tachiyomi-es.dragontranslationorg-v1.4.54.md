# Extension Validation Report

- Extension: tachiyomi-es.dragontranslationorg-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4647982373411241498
- Source name: DragonTranslation.org
- Source language: es
- Selected manga input: latest offset 0: Un diario de conquista (`.../un-diario-de-conquista`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Deja de fumar (`.../deja-de-fumar`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | No Quiero A La Hija, Si No A Su Madre (`.../no-quiero-a-la-hija-si-no-a-su-madre`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Un diario de conquista (`.../un-diario-de-conquista`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Kamakiri Maid to Chouchou no Goshujin-sama (`.../akcxxxslpdjqgvm`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Un diario de conquista (`.../un-diario-de-conquista`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Un diario de conquista (`.../un-diario-de-conquista`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 100 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Un diario de conquista, URL=`.../un-diario-de-conquista` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dragontranslation.org/.../11570_17O1b1E857m4O4L1g0qdpG7Ito0nr2M8P78dt81W1Y19TgI3143i9n7zc9Wt71sf.webp` (image/webp (encoding: lossy), 40200 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../un-diario-de-conquista` |  |  |  |
| details thumbnail URL | PASS | `https://dragontranslation.org/.../11570_17O1b1E857m4O4L1g0qdpG7Ito0nr2M8P78dt81W1Y19TgI3143i9n7zc9Wt71sf.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +18, Accion, Ecchi, Fantasia, Harén, Magia, Milf, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El eco de una vida anterior, marcada por la derrota y la desesperación, resuena en el alma de quien ahora recibe una segunda oportunidad. En un mundo al borde del abismo, donde la sombra de la aniquilación se cierne sobre la humanidad, su misión es clara: reescribir el destino. Pero esta vez, no lo hará solo. Con una voluntad inquebrantable y un corazón dispuesto a arriesgarlo todo, deberá forjar lazos inquebrantables, seducir voluntades y conquistar los corazones más poderosos. Cada mirada, cada promesa, cada afecto ganado es una pieza crucial en su estrategia para evitar la masacre y enfrentar a la temible Reina Demonio. ¿Será el amor su arma más letal, o la condena que lo arrastre de nuevo a la oscuridad? El velo del misterio se alza, y el primer capítulo de esta épica conquista te espera. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 100 chapters |  |  |  |
| chapter dates | PASS | 100 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dragontranslation.org/.../001.jpg` (image/jpeg, 517439 bytes, 900x7250) |  |  |  |
