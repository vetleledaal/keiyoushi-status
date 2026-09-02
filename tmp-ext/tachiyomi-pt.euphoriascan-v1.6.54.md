# Extension Validation Report

- Extension: tachiyomi-pt.euphoriascan-v1.6.54
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6045078216682014867
- Source name: Euphoria Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: A Sedução da Serpente Sagrada (`.../423`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A Sedução da Serpente Sagrada (`.../423`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Love & Hatred (`.../126`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Teoria do Amor (`.../254`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Speak up (`.../873`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Sedução da Serpente Sagrada (`.../423`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Sedução da Serpente Sagrada (`.../423`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Capítulo 27 (`.../capitulo-27`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Sedução da Serpente Sagrada, URL=`423` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 100/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://euphoriascan.com/.../tall-4-350x476.webp` (image/webp (encoding: lossy), 32488 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `423` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://euphoriascan.com/.../tall-4-193x278.webp` (image/webp (encoding: lossy), 14470 bytes, 193x278) |  |  |  |
| details author | PASS | Dagom |  |  |  |
| details artist | PASS | Dagom |  |  |  |
| details genres | PASS | Drama, Fantasia, Romance, Ativo |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Fansub: Euphoria Scan<br><br>Uma cobra quer que eu conceba sua prole, mas os homens podem engravidar? Em troca, ele me concederá um desejo Serei capaz de salvar a vida do meu avô?<br><br>Nomes alternativos: 내 씨를 품어줘야겠다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | LINT | 6 of 52 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://euphoriascan.com/.../0.jpg` (image/jpeg, 174834 bytes, 1280x720) |  |  |  |
