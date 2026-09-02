# Extension Validation Report

- Extension: tachiyomi-pt.acervohentai-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 381670977542268077
- Source name: Acervo Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Minha Nova Família Me Trata Muito Bem (`.../minha-nova-familia-me-trata-muito-bem`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Minha Nova Família Me Trata Muito Bem (`.../minha-nova-familia-me-trata-muito-bem`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Mantenha Isso em Segredo da Mãe! (`.../mantenha-isso-em-segredo-da-mae`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 1 | Cão Patrulheiro (`.../cao-patrulheiro`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 5 | Minha Nova Família Me Trata Muito Bem (`.../minha-nova-familia-me-trata-muito-bem`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Minha Nova Família Me Trata Muito Bem (`.../minha-nova-familia-me-trata-muito-bem`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Minha Nova Família Me Trata Muito Bem (`.../minha-nova-familia-me-trata-muito-bem`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 131 | Capítulo 1 (`https://acervohentai.com/.../capitulo-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Minha Nova Família Me Trata Muito Bem, URL=`.../minha-nova-familia-me-trata-muito-bem` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://acervohentai.com/.../My-New-Family-Treats-me-Well-1-175x238.webp` (image/webp (container: extended), 8598 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../minha-nova-familia-me-trata-muito-bem` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://acervohentai.com/.../My-New-Family-Treats-me-Well-1.webp` (image/webp (container: extended), 29590 bytes, 500x700) |  |  |  |
| details author | PASS | Kim Seran |  |  |  |
| details artist | PASS | Kamja |  |  |  |
| details genres | PASS | ahegao, Harém, Irmã, Mãe, Masturbação, MILF, Peitos Grandes, Drama, Privado, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | My New Family Treats me Well manhwa conhecido como Mi nueva familia es muy amable é um webtoon de 2024 com tradução para português. Feita por Kim Seran e Kamja. Essa história é sobre romance e Mãe e ahegao.<br><br>Conheci minha nova família depois de ser resgatada de uma família abusiva ainda jovem… Mas minha mãe é uma atriz carismática, minha irmã mais velha é uma lenda do golfe, e minha irmã mais nova é uma ídolo popular! Não sou merecedor da minha nova família, mas eles são muito legais comigo. “Sua mãe vai cuidar dos seus impulsos, filho.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 131 chapters |  |  |  |
| chapter dates | PASS | 131 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 131 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://acervohentai.com/.../Cap%C3%ADtulo-1_1.webp` (image/webp (encoding: lossy), 141924 bytes, 720x5005) |  |  |  |
