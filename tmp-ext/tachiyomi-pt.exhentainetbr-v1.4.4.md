# Extension Validation Report

- Extension: tachiyomi-pt.exhentainetbr-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1408140394859123923
- Source name: ExHentai.net.br
- Source language: pt-BR
- Selected manga input: popular offset 0: Persuadindo a Chefe (`.../persuadindo-a-chefe`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Persuadindo a Chefe (`.../persuadindo-a-chefe`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | A Farmacêutica Peituda Kusunoki-San da Farmácia 24 horas (`.../a-farmaceutica-peituda-kusunoki-san-da-farmacia-24-horas`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Persuadindo a Chefe (`.../persuadindo-a-chefe`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Persuadindo a Chefe (`.../persuadindo-a-chefe`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo 1 (`.../chapter <redacted query values: id, ch, img, and paged>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Persuadindo a Chefe, URL=`.../persuadindo-a-chefe` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://exhentai.net.br/.../Persuadindo-a-Chefe-01.webp` (image/webp (encoding: lossy), 119474 bytes, 1289x1821) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../persuadindo-a-chefe` |  |  |  |
| details thumbnail URL | PASS | `https://exhentai.net.br/.../Persuadindo-a-Chefe-01.webp` |  |  |  |
| details author | PASS | DYTM |  |  |  |
| details artist | PASS | DYTM |  |  |  |
| details genres | PASS | Ahegao, Boquete, Bunda Grande, Espanhola, Pelos Pubianos, Seios Grandes |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://exhentai.net.br/.../Persuadindo-a-Chefe-01.webp` (image/webp (encoding: lossy), 119474 bytes, 1289x1821) |  |  |  |
