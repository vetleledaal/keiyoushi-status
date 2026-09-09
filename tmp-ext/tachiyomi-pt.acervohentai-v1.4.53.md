# Extension Validation Report

- Extension: tachiyomi-pt.acervohentai-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 381670977542268077
- Source name: Acervo Hentai
- Source language: pt-BR
- Selected manga input: latest offset 0: Cão Patrulheiro (`.../cao-patrulheiro`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Minha Nova Família Me Trata Muito Bem (`.../minha-nova-familia-me-trata-muito-bem`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Mantenha Isso em Segredo da Mãe! (`.../mantenha-isso-em-segredo-da-mae`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 1 | Cão Patrulheiro (`.../cao-patrulheiro`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 5 | Minha Nova Família Me Trata Muito Bem (`.../minha-nova-familia-me-trata-muito-bem`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cão Patrulheiro (`.../cao-patrulheiro`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cão Patrulheiro (`.../cao-patrulheiro`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 57 | Capítulo 1 (`https://acervohentai.com/.../capitulo-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| latest listing | PASS | 1 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cão Patrulheiro, URL=`.../cao-patrulheiro` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://acervohentai.com/.../Dog-on-Patrol-portugues-1-175x238.webp` (image/webp (encoding: lossy), 12204 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cao-patrulheiro` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://acervohentai.com/.../Dog-on-Patrol-portugues-1.webp` (image/webp (container: extended), 61264 bytes, 600x800) |  |  |  |
| details author | PASS | C.Dyce |  |  |  |
| details artist | PASS | G-goon |  |  |  |
| details genres | PASS | ahegao, Anal, Exclusivo, Harém, Masturbação, Pau Grande, Traição, Adulto, Comedia, Drama, Romance, Slice of Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Dog on Patrol manhwa conhecido como ???? ? ??? é um manhwa lançando em 2019 com tradução para português do brasil. Obra feita por C.Dyce e desenhada por G-goon. Dog on Patrol Pornhwa Esse webtoon é sobre romance e harém.<br><br>No Vale Mejong, quatro garotas dividem a casa, mas há alguém espionando. O Sr. H. é contratado como segurança e acaba assumindo diversas outras “funções” para as moradoras. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 57 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://acervohentai.com/.../Dog-on-Patrol-1-(0).webp` (image/webp (container: extended), 78262 bytes, 850x1200) |  |  |  |
