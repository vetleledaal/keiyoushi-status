# Extension Validation Report

- Extension: tachiyomi-pt.mangalivre-v1.6.89
- Input artifact: JAR
- Generated at: 2026-10-11T13:00:00Z
- Commit: 3df7aa5dc2613c41f30455c4341f97509654cf8b+dirty
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2834885536325274328
- Source name: ToonLivre
- Source language: pt-BR
- Selected manga input: latest offset 0: Imperador Marcial da Luz e das Trevas (`.../obra-b2bb4998`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Retorno do Cão de Caça dos Baskerville (`.../obra-c1f65a0b`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Eu Matei Um Jogador da Academia (`.../obra-a831559c`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Imperador Marcial da Luz e das Trevas (`.../obra-b2bb4998`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | O Gênio Marcial Que Lembra de Tudo (`.../obra-f22d8f75`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Imperador Marcial da Luz e das Trevas (`.../obra-b2bb4998`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Imperador Marcial da Luz e das Trevas (`.../obra-b2bb4998`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 69 | Capítulo 01 (`.../01`) |  | <1s |
| pages | `getPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Imperador Marcial da Luz e das Trevas, URL=`obra-b2bb4998` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.toonlivre.net/.../cover-95e0fe0fd6bbaeb6d74231221d088ce1.webp` (image/webp (encoding: lossy), 157652 bytes, 720x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `obra-b2bb4998` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.toonlivre.net/.../cover-95e0fe0fd6bbaeb6d74231221d088ce1.webp` |  |  |  |
| details author | PASS | Baek Joon, Hyeon Lim |  |  |  |
| details artist | PASS | VICTOR |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Artes Marciais |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Após ver seu clã ser massacrado, Yeon Hojung seguiu o caminho das trevas e ascendeu como o poderoso Imperador das Trevas. Porém, depois de morrer em batalha, ele retorna 26 anos ao passado, quando sua família ainda estava viva. Com uma segunda chance em mãos, Hojung fará de tudo para salvar seu clã e reescrever o próprio destino.<br><br><br> Nome alternativo: Black and White Martial Emperor<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | PASS | 69 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
