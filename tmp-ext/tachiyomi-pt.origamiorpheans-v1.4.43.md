# Extension Validation Report

- Extension: tachiyomi-pt.origamiorpheans-v1.4.43
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4038055363600290082
- Source name: Origami Orpheans
- Source language: pt-BR
- Selected manga input: latest offset 0: Kono Healer Mendokusai (`.../kono-healer-mendokusai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | Shuumatsu no Harem (`.../shuumatsu-no-harem`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 21 | Kono Healer Mendokusai (`.../kono-healer-mendokusai`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kono Healer Mendokusai (`.../kono-healer-mendokusai`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kono Healer Mendokusai (`.../kono-healer-mendokusai`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 47 | Capítulo 1 (`.../kono-healer-mendokusai-cap-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kono Healer Mendokusai, URL=`.../kono-healer-mendokusai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://origami-orpheans.com/.../FM-bJp6WUBYMKRB-202x300.webp` (image/webp (encoding: lossy), 18288 bytes, 202x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kono-healer-mendokusai` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://origami-orpheans.com/.../FM-bJp6WUBYMKRB.webp` (image/webp (encoding: lossless), 202758 bytes, 322x478) |  |  |  |
| details author | PASS | Tannen ni Hakkou |  |  |  |
| details artist | PASS | Tannen ni Hakkou |  |  |  |
| details genres | PASS | Aventura, Comédia, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Comédia de fantasia e aventura estrelada por Karla, a clériga Elfa Negra que investiu demais em suas habilidades de provocação, e Alvin, o espadachim que tem que aturar ela.<br><br>Nomes alternativos: This Healer is Annoying |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://origami-orpheans.com/.../00-2.jpg` (image/jpeg, 444691 bytes, 950x650) |  |  |  |
