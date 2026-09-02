# Extension Validation Report

- Extension: tachiyomi-pt.azuretoons-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6272815455807597212
- Source name: Azuretoons
- Source language: pt-BR
- Selected manga input: popular offset 0: Rei do Gado (`.../rei-do-gado`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 174 | Rei do Gado (`.../rei-do-gado`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 174 | Mestre Espadachim Criado Pelas Estrelas (`.../mestre-espadachim-criado-pelas-estrelas`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Rei do Gado (`.../rei-do-gado`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 529 | 1 (`.../1.0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 62 |  |  | 10s+ |

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
| popular listing | PASS | 174 entries |  |  |  |
| latest listing | PASS | 174 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 348/348 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 348/348 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://azuretoons.com/.../image <redacted query values: url and hash>` (image/webp (encoding: lossy), 30492 bytes, 444x593) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../rei-do-gado` |  |  |  |
| details thumbnail URL | PASS | `https://azuretoons.com/.../image <redacted query values: url and hash>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A história segue um protagonista que, após ser desprezado e traído por sua namorada (por quem ele fazia tudo, trabalhando em vários empregos para sustentá-la), recebe um "sistema". Esse sistema lhe concede a quantia astronômica de 90 bilhões de moedas (Licking Gold), mas com uma condição específica: o dinheiro só pode ser gasto com mulheres para ganhar o afeto delas ou impressioná-las (o termo "licking dog" ou tiǎn gǒu é uma gíria chinesa para alguém que persegue excessivamente uma pessoa que não tem interesse nela, similar ao termo "simp"). À medida que ele gasta essa fortuna com diferentes mulheres, ele recebe recompensas e transforma sua vida de um "perdedor" para um homem extremamente rico e influente. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 529 chapters |  |  |  |
| chapter dates | PASS | 529 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://azuretoons.com/.../image <redacted query values: url and hash>` (image/webp (encoding: lossy), 214474 bytes, 800x1533) |  |  |  |
