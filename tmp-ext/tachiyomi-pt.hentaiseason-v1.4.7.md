# Extension Validation Report

- Extension: tachiyomi-pt.hentaiseason-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gattsu
- Source ID: 28629678708276
- Source name: Hentai Season
- Source language: pt-BR
- Selected manga input: popular offset 0: Quer fazer isso com a Onee-san? Você pode fazer o que quiser com o cartão de pau 05 (`.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Quer fazer isso com a Onee-san? Você pode fazer o que quiser com o cartão de pau 05 (`.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Minha mãe continua sendo super sexy 01 (`.../minha-mae-continua-sendo-super-sexy-01`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Quer fazer isso com a Onee-san? Você pode fazer o que quiser com o cartão de pau 05 (`.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Minha mãe continua sendo super sexy 01 (`.../minha-mae-continua-sendo-super-sexy-01`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Quer fazer isso com a Onee-san? Você pode fazer o que quiser com o cartão de pau 05 (`.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Quer fazer isso com a Onee-san? Você pode fazer o que quiser com o cartão de pau 05 (`.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 10s+ |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Quer fazer isso com a Onee-san? Você pode fazer o que quiser com o cartão de pau 05, URL=`.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaiseason.com/.../quer_fazer_isso_onee_san_06_01-241x334.webp` (image/webp (encoding: lossy), 19262 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../quer-fazer-isso-com-a-onee-san-voce-pode-fazer-o-que-quiser-com-o-cartao-de-pau-05-2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaiseason.com/.../quer_fazer_isso_onee_san_06_01.webp` (image/webp (encoding: lossy), 159404 bytes, 1280x1806) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegão, Creampie, lançamentos, Peitão, Pelos Pubianos |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sinopse: Yuki está sobrecarregada com o trabalho e, para piorar, não está sentindo prazer nenhum com as relações que tem tido. Agora, vai sobrar para o jovem Matsuo-kun ajudá-la a lidar com toda essa falta de prazer… Comissão de traduções? Você pode pedir uma aqui! Sugestão de packs? Participe do nosso discord clicando aqui! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaiseason.com/.../quer_fazer_isso_onee_san_06_01.webp` (image/webp (encoding: lossy), 159404 bytes, 1280x1806) |  |  |  |
