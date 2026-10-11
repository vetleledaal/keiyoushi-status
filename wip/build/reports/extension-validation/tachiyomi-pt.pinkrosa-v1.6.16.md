# Extension Validation Report

- Extension: tachiyomi-pt.pinkrosa-v1.6.16
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 8456404960509331854
- Source name: Pink Rosa
- Source language: pt-BR
- Selected manga input: popular offset 0: A Jornada de uma Elfa Negra com Poderes em Declínio (`.../a-jornada-de-uma-elfa-negra-com-poderes.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | A Jornada de uma Elfa Negra com Poderes em Declínio (`.../a-jornada-de-uma-elfa-negra-com-poderes.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Um Imperador da Espada reencarnou como um Príncipe Lixo (`.../zense-wa-kentei-konjou-kuzu-ouji.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Jornada de uma Elfa Negra com Poderes em Declínio (`.../a-jornada-de-uma-elfa-negra-com-poderes.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Jornada de uma Elfa Negra com Poderes em Declínio (`.../a-jornada-de-uma-elfa-negra-com-poderes.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | Chapter 01 (`.../chapter-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Jornada de uma Elfa Negra com Poderes em Declínio, URL=`.../a-jornada-de-uma-elfa-negra-com-poderes.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../00.png` (image/png, 885950 bytes, 600x861) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-jornada-de-uma-elfa-negra-com-poderes.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../00.png` (image/png, 2711479 bytes, 1115x1600) |  |  |  |
| details author | PASS | Daisuke Itabashi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasia, Magia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Após perder seus poderes, foi que ela finalmente enxergou a verdadeira beleza do mundo… Amira, antes conhecida como a “conjuradora onipotente”, esgotou completamente sua força mágica e agora vive como uma elfa negra comum. Se antes iluminava o mundo com seus feitiços, hoje conversa com o vento, acende o fogo com as próprias mãos, aprende a cozinhar e busca um novo sentido para sua vida. A felicidade tranquila e os pequenos milagres do cotidiano tomaram o lugar da magia absoluta que um dia definiu sua existência. Que descobertas aguardam Amira nessa fantasia de recomeço, enquanto ela aprende a viver novamente após a perda? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00.png` (image/png, 2711479 bytes, 1115x1600) |  |  |  |
