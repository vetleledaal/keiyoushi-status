# Extension Validation Report

- Extension: tachiyomi-es.noblessetranslations-v1.4.59
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 1
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5125011410949702843
- Source name: Noblesse Translations
- Source language: es
- Selected manga input: latest offset 0: El Mago Sin Valor Del Margrave (`.../el-mago-sin-valor-del-margrave-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Después de Obtener Riqueza y Libertad, Ofrecen su Lealtad (`.../despues-de-obtener-riqueza-y-libertad-ofrecen-su-lealtad`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | De un Inútil Cargo hasta el Amo de Rango DEFINITIVO (`.../de-un-inutil-cargo-hasta-el-amo-de-rango-definitivo`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | El Mago Sin Valor Del Margrave (`.../el-mago-sin-valor-del-margrave-2`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Star Ginseng Store (`.../tienda-tres-estrellas`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | El Mago Sin Valor Del Margrave (`.../el-mago-sin-valor-del-margrave-2`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | El Mago Sin Valor Del Margrave (`.../el-mago-sin-valor-del-margrave-2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 24 | Capítulo 01 (`https://nobledicion.yoveo.xyz/.../captulo-01d5ac1096381705460463b5fa225f137c <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 78 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Mago Sin Valor Del Margrave, URL=`.../el-mago-sin-valor-del-margrave-2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 45/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-mago-sin-valor-del-margrave-2` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tu biblioteca online de Manhwas +18 en español y raws favoritos en una sola pagina – Manhwa Web |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 24 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 78 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://nobledicion.yoveo.xyz/.../0001.webp` (image/webp (encoding: lossy), 289458 bytes, 720x4593) |  |  |  |
