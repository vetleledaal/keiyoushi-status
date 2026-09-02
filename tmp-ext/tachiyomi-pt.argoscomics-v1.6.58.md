# Extension Validation Report

- Extension: tachiyomi-pt.argoscomics-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2731562656488805764
- Source name: Argos Comics
- Source language: pt-BR
- Selected manga input: latest offset 0: O Renascimento Do Primogênito Mais Forte (`.../o-renascimento-do-primogenito-mais-forte`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Agricultura No Modo Hack Em Outro Mundo (`.../agricultura-no-modo-hack-em-outro-mundo`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | A “Vida Pacífica” De Um Aventureiro Rank A (`.../a-vida-pacifica-de-um-aventureiro-rank-a`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | O Renascimento Do Primogênito Mais Forte (`.../o-renascimento-do-primogenito-mais-forte`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Renascimento Do Primogênito Mais Forte (`.../o-renascimento-do-primogenito-mais-forte`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Renascimento Do Primogênito Mais Forte (`.../o-renascimento-do-primogenito-mais-forte`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | 1.0 (`.../1.0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.NullPointerException | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Renascimento Do Primogênito Mais Forte, URL=`.../o-renascimento-do-primogenito-mais-forte` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://supabase.aniargos.com/.../5c804f47-b18e-4b42-b439-fe87f86a7d1e.webp` (image/webp (encoding: lossy), 99168 bytes, 640x800; server Content-Type: text/plain;charset=UTF-8) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-renascimento-do-primogenito-mais-forte` |  |  |  |
| details thumbnail URL | PASS | `https://supabase.aniargos.com/.../5c804f47-b18e-4b42-b439-fe87f86a7d1e.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Meow Culture, Meow Meow Anime |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Dungeons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O jovem Wu Zhi morre e reencarna no mundo da história Water Margin (Margem de Água) e assume o corpo do jovem Wu Dalang. Usando sua inteligência, ele enfrenta Ximen Qing em batalhas de astúcia e, com o conhecimento do futuro, conquista diversos heróis.<br><br>Titulos alternativos: 重生水浒世界之最强武大郎<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | pages operation did not complete successfully |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
