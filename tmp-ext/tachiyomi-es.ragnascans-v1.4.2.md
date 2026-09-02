# Extension Validation Report

- Extension: tachiyomi-es.ragnascans-v1.4.2
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
- Source ID: 6003330990591348231
- Source name: Ragna Scans
- Source language: es
- Selected manga input: popular offset 0: Ha llegado el final (`.../manga.php <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Ha llegado el final (`.../manga.php <redacted query values: id>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Estoy bien, Gracias, ¿y Tú? (`.../manga.php <redacted query values: id>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Una Atracción Inevitable (`.../manga.php <redacted query values: id>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Un ejemplo perfecto de una maldición que salió mal (`.../manga.php <redacted query values: id>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ha llegado el final (`.../manga.php <redacted query values: id>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ha llegado el final (`.../manga.php <redacted query values: id>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 79 | Capítulo 0 (`.../capitulo-0.00`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ha llegado el final, URL=`.../manga.php <redacted query values: id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lector.ragnascan.xyz/.../031110db4bb3ec51d5aea026831d4272.webp` (image/webp (encoding: lossy), 565650 bytes, 2102x2992) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga.php <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://lector.ragnascan.xyz/.../031110db4bb3ec51d5aea026831d4272.webp` |  |  |  |
| details author | PASS | Desconocido |  |  |  |
| details artist | PASS | Desconocido |  |  |  |
| details genres | PASS | Acción, Aventura, Supervivencia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El mundo ha caído. Los zombis vagan por las calles. La civilización se desmorona. Y en medio de todo esto... Un torpe, arruinado y acosado marginado llamado Jung Min-jun se encuentra con la última persona que esperaba: Han Ye-na, una chica rica y popular que nunca ha tenido que luchar por nada en su vida. Ahora, la supervivencia no es sólo cuestión de fuerza o dinero. Se trata de confianza, valentía y de sobrevivir juntos al fin del mundo. Desde silencios incómodos hasta batallas sangrientas, ¿podrá este dúo improbable sobrevivir al apocalipsis zombi e incluso aprender a entenderse por el camino? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 79 chapters |  |  |  |
| chapter dates | PASS | 79 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lector.ragnascan.xyz/.../1.webp` (image/webp (encoding: lossy), 117096 bytes, 900x1512) |  |  |  |
