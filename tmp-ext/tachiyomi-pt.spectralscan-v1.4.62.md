# Extension Validation Report

- Extension: tachiyomi-pt.spectralscan-v1.4.62
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5304928452449566995
- Source name: Nexus Toons
- Source language: pt-BR
- Selected manga input: popular offset 0: Pico Marcial (`.../pico-marcial`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | Pico Marcial (`.../pico-marcial`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | O Novato de Nível Máximo (`.../o-novato-de-nivel-maximo`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | O soldado esqueleto não pôde proteger a masmorra (`.../o-soldado-esqueleto-nao-pode-proteger-a-masmorra`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | Imperador Solo (`.../imperador-solo`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Pico Marcial (`.../pico-marcial`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Pico Marcial (`.../pico-marcial`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3862 | Capítulo 1 (`.../pico-marcial`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pico Marcial, URL=`.../pico-marcial` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 230/230 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 230/230 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.nx-toons.xyz/.../f35e596610000492_1770164958605219986.png` (image/png, 255825 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pico-marcial` |  |  |  |
| details thumbnail URL | PASS | `https://img.nx-toons.xyz/.../f35e596610000492_1770164958605219986.png` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Ecchi, Harem, Artes Marciais, Cultivo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A jornada para o topo das artes marcial é solitária e longa. Enfrentando várias adversidades, você deve sobreviver e permanecer inflexível. Somente então conseguirá romper as barreiras e continuar sua jornada para se tornar o mais forte. Pavilhão celestial testa seus discípulos da maneira mais severa para prepará-los para essa jornada. Um dia, o humilde varredor do pavilhão Yang Kai conseguiu obter um livro negro, colocando-o no caminho rumo ao topo das artes marciais. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3862 chapters |  |  |  |
| chapter dates | PASS | 3862 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.nx-toons.xyz/.../page_1_0d2ef36b.avif` (image/avif (format: avif), 62323 bytes, 735x550) |  |  |  |
