# Extension Validation Report

- Extension: tachiyomi-es.mangavault-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 568182773829502484
- Source name: MangaVault
- Source language: es
- Selected manga input: popular offset 0: Callate dragona malvada, ya no quiero criar hijos contigo (`.../callate-dragona-malvada-ya-no-quiero-criar-hijos-contigo-aae196`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Callate dragona malvada, ya no quiero criar hijos contigo (`.../callate-dragona-malvada-ya-no-quiero-criar-hijos-contigo-aae196`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 39 | Un dolor persistente (`.../un-dolor-persistente-c0ab63`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 37 | El Retorno del Patriarca Mil Años Después (`.../el-retorno-del-patriarca-mil-anos-despues-d2e97a`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Callate dragona malvada, ya no quiero criar hijos contigo (`.../callate-dragona-malvada-ya-no-quiero-criar-hijos-contigo-aae196`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Callate dragona malvada, ya no quiero criar hijos contigo (`.../callate-dragona-malvada-ya-no-quiero-criar-hijos-contigo-aae196`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 132 | Capítulo 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 39 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Callate dragona malvada, ya no quiero criar hijos contigo, URL=`.../callate-dragona-malvada-ya-no-quiero-criar-hijos-contigo-aae196` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.mangavault.lat/.../manga-632c4c34.png` (image/png, 2368150 bytes, 1060x1484) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../callate-dragona-malvada-ya-no-quiero-criar-hijos-contigo-aae196` |  |  |  |
| details thumbnail URL | PASS | `https://media.mangavault.lat/.../manga-632c4c34.png` |  |  |  |
| details author | PASS | Milkshake tail sauce |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Seinen, Dragon Girl/s, Drama, Romance, Acción, Comedia, Aventura, Fantasía, Magia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Después de ser derrotado y capturado, el asesino de dragones León se convirtió en cautivo de la Reina Dragón de Plata. Con la conciencia de la muerte, usó magia prohibida para maldecir a la reina, pero inesperadamente, la reina perdió el control. Pensó que esto haría que la reina viviera con vergüenza por el resto de su vida, y sería digna de la misión del asesino del dragón. Pero dos años después, cuando Leon abrió los ojos, junto a él había una pequeña niña dragón con cola...<br><br>**Alternative Names:**<br>- Shut Up, Malevolent Dragon! I Don’t Want to Have Any More Children With You<br>- 闭嘴恶龙我不想再跟你带孩子了 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.mangavault.lat/.../0000-2e2665be.webp` (image/webp (container: extended), 176202 bytes, 1721x1117; server Content-Type: image/jpeg) |  |  |  |
