# Extension Validation Report

- Extension: tachiyomi-pt.starlightscan-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7977736050206547443
- Source name: Starlight Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Love Hate Prince (`.../love-hate-prince`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Love Hate Prince (`.../love-hate-prince`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Punks Triangle (`.../punks-triangle`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Otoshi-Ai (`.../otoshi-ai`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Love Hate Prince (`.../love-hate-prince`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Love Hate Prince (`.../love-hate-prince`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | Capítulo 01 (`.../love-hate-prince <redacted query values: episodio>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Love Hate Prince, URL=`.../love-hate-prince` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://starligthscan.com/.../000.jpg` (image/jpeg, 122060 bytes, 800x1134) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../love-hate-prince` |  |  |  |
| details thumbnail URL | PASS | `https://starligthscan.com/.../000.jpg` |  |  |  |
| details author | PASS | KAGO Santa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +18, Ativo, Comédia, Mangá, Romance, Vida adulta, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | No seu aniversário de 20 anos, a vida tranquila de Jyuri, um funcionário de uma loja de ramen, é virada de cabeça para baixo quando seu avô, com quem não tinha contato há anos, reaparece e pede que ele se mude para Tóquio, se matricule em uma universidade de prestígio e se prepare para ser o herdeiro de sua poderosa corporação. Na esperança de retribuir o apoio da família e honrar os desejos de sua falecida mãe, Jyuri mergulha em um mundo de riqueza e expectativas muito além de sua zona de conforto. Mas sua nova vida começa de forma caótica quando lhe é designado um zelador rigoroso e intimidador, Kai, e ele é forçado a morar com ele em uma mansão luxuosa. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://starligthscan.com/.../000-1.jpg` (image/webp (encoding: lossy), 113860 bytes, 800x1134) |  |  |  |
