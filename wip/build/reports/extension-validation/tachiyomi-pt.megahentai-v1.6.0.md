# Extension Validation Report

- Extension: tachiyomi-pt.megahentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6293316436960053544
- Source name: MegaHentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Alternative Account Trap (`.../alternative-account-trap`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Alternative Account Trap (`.../alternative-account-trap`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Hero Manager (`.../hero-manager`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Cheer Love! (`.../cheer-love`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Taste Folder (`.../taste-folder`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Alternative Account Trap (`.../alternative-account-trap`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Alternative Account Trap (`.../alternative-account-trap`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Capítulo 1 (`.../alternative-account-trap-capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Alternative Account Trap, URL=`alternative-account-trap` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://megahentai.biz/.../1365797863.webp` (image/webp (container: extended), 71712 bytes, 300x410) |  |  |  |
| details identity | PASS | Details preserved selected URL `alternative-account-trap` |  |  |  |
| details thumbnail URL | PASS | `https://megahentai.biz/.../1365797863.webp` |  |  |  |
| details author | PASS | Hee Min |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Harem, Mangá Hentai, Manhwa, Romance, Webtoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Account Trap nome alternativo (Have You Seen That) é um manhwa em lançamento (no pt-BR) lançado em 2024. A obra é escrita Hee-min e ilustrada por Hee-min. Alternative Account Trap manhwa é uma história para adultos sobre romance e harém. Alternative Account Trap: Uma “Conta Alt” se refere a uma conta secreta de mídia social que você não pode mostrar facilmente aos outros. “Kang Suhyun” é alguém popular o suficiente para ser presidente de classe e também se destacar na escola, mas como dizem, o quanto mais brilhante a luz, mais escura a sombra. Ele secretamente administra uma conta de arte explícita nas redes sociais que absolutamente ninguém pode descobrir, mas… “Pensar que sunbae é o famoso artista explícito…Hehe… Parece que encontrei seu ponto fraco agora…” Infelizmente, sua identidade oculta é descoberta por “Lim Ji-ah”, um pária socialmente desajeitado da escola. Daquele momento em diante, a vida antes comum de Suhyun |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | LINT | 19 of 20 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=19 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gall.megahentai.biz/.../1.webp` (image/webp (encoding: lossy), 287676 bytes, 720x4620) |  |  |  |
