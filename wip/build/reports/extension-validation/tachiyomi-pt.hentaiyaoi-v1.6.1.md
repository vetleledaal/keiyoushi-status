# Extension Validation Report

- Extension: tachiyomi-pt.hentaiyaoi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6995004880331021153
- Source name: Hentai Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Vamos Fazer de Novo (`.../vamos-fazer-de-novo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Vamos Fazer de Novo (`.../vamos-fazer-de-novo`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Sogro ♡ Genro ♡ Família Anormal (`.../sogro-%E2%99%A1-genro-%E2%99%A1-familia-anormal`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Vamos Fazer de Novo (`.../vamos-fazer-de-novo`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Vamos Fazer de Novo (`.../vamos-fazer-de-novo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../vamos-fazer-de-novo`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | <1s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vamos Fazer de Novo, URL=`.../vamos-fazer-de-novo` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 34/34 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 34/34 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaiyaoi.net/.../1300830350848909312_0001-360x500.jpg` (image/jpeg, 59264 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vamos-fazer-de-novo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaiyaoi.net/.../1300830350848909312_0001.jpg` (image/jpeg, 430098 bytes, 1080x1525) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doujinshi, Hentai, Anal, Brinquedos Sexuais, Creampie, Dedilhada, Massagem na Próstata, Masturbação, Raio-X, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Após a história principal de AntiFunny, Kanato Doi e Tsumugi Hanami namoram e tentam ter sua primeira noite, que falha devido à dor de Tsumugi. Após pesquisar e praticar sozinho, Tsumugi admite a Doi que se preparou fantasiando com ele. Aproveitando que o pai de Doi está viajando, os dois decidem tentar novamente.<br><br>**Paródia:** Original · **Cor:** Preto e Branco · **Tradutor:** DiegoVPR |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaiyaoi.net/.../1300830350848909312_0001.jpg` (image/jpeg, 430098 bytes, 1080x1525) |  |  |  |
