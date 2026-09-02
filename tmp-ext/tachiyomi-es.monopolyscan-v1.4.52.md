# Extension Validation Report

- Extension: tachiyomi-es.monopolyscan-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5862188113261788590
- Source name: Monopoly Scan
- Source language: es
- Selected manga input: latest offset 0: ¡Mientras mis discipulos se matan entrenando, yo me relajo! (`.../mientras-mis-discipulos-se-matan-entrenando-yo-me-relajo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Todo comienza con un balance de mil billones en el Inframundo (`.../todo-comienza-con-un-balance-de-mil-billones-en-el-inframundo`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | ¡Me hago más fuerte al dormir! (`.../me-hago-mas-fuerte-al-dormir`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | ¡Mientras mis discipulos se matan entrenando, yo me relajo! (`.../mientras-mis-discipulos-se-matan-entrenando-yo-me-relajo`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Cuñada: ¡De verdad… ya no soy un idiota! (`.../cunada-de-verdad-ya-no-soy-un-idiota`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ¡Mientras mis discipulos se matan entrenando, yo me relajo! (`.../mientras-mis-discipulos-se-matan-entrenando-yo-me-relajo`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ¡Mientras mis discipulos se matan entrenando, yo me relajo! (`.../mientras-mis-discipulos-se-matan-entrenando-yo-me-relajo`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 203 | Capitulo 1_d56c0d (`https://monopolymanhua.com/.../capitulo-1_d56c0d <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=¡Mientras mis discipulos se matan entrenando, yo me relajo!, URL=`.../mientras-mis-discipulos-se-matan-entrenando-yo-me-relajo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://monopolymanhua.com/.../porta-con-nombre-350x476.png` (image/png, 125276 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mientras-mis-discipulos-se-matan-entrenando-yo-me-relajo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://monopolymanhua.com/.../porta-con-nombre.png` (image/png, 1210147 bytes, 765x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Cultivación |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fui engañado y dejado al borde de la ruina por unos Traidores, estuve a punto de convertirme en el anciano de menor duración en la historia de la secta… Afortunadamente obtuve una bendición divina, se vinculo a mi el sistema de recompensas por entrenar discípulos, cuando les doy píldoras basuras a mis discípulos el sistema me da píldoras supremas. Voy a vengarme Primero y me volveré rico después, ¡hasta ascender como el Emperador Inmortal más poderoso!. El farmacéutico amable, la emperatriz sensual y el supremo de la espada… ¡todos son mis discípulos! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | LINT | All 203 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=203 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 203 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://monopolymanhua.com/.../01.webp` (image/webp (encoding: lossy), 1172174 bytes, 800x13535) |  |  |  |
