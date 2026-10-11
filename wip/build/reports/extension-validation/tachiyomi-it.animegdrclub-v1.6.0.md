# Extension Validation Report

- Extension: tachiyomi-it.animegdrclub-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 726858430404746545
- Source name: Anime GDR Club
- Source language: it
- Selected manga input: popular offset 0: Absolute Duo (`.../progetto.php <redacted query values: nome>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 133 | Absolute Duo (`.../progetto.php <redacted query values: nome>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | Mushoku Tensei - Isekai Ittara Honki Dasu (`.../progetto.php <redacted query values: nome>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Absolute Duo (`.../progetto.php <redacted query values: nome>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Absolute Duo (`.../progetto.php <redacted query values: nome>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 23 | Capitolo 0 (`.../readerr.php <redacted query values: nome, numcap, and nomecompleto>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 133 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Absolute Duo, URL=`progetto.php?nome=absolute` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 142/142 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 142/142 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `http://www.agcscanlation.it/.../houseki.jpg` -> 2 manga URLs (examples: `progetto.php?nome=houseki`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../skeleton.jpg` -> 2 manga URLs (examples: `progetto.php?nome=skeleton`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../slow.jpg` -> 2 manga URLs (examples: `progetto.php?nome=slow`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../mushoku.jpg` -> 2 manga URLs (examples: `progetto.php?nome=mushoku`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../sentouin.jpg` -> 2 manga URLs (examples: `progetto.php?nome=sentouin`, `.../progetto.php <redacted query values: nome>`) |  |  |  |
| thumbnail | PASS | `http://www.agcscanlation.it/.../absolute.jpg` (image/jpeg, 298779 bytes, 477x650) |  |  |  |
| details identity | PASS | Details preserved selected URL `progetto.php?nome=absolute` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Harem, Sentimentale, Scolastico |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Dopo aver perso sua sorella minore in un incidente, Tor Kokonoe decide di voler diventare più forte e per questo motivo si iscrive all'accademia Kōryō, una scuola speciale dove gli studenti manifestano le proprie anime sotto forma di armi chiamate Blaze. Anche Tor è in grado di generare la sua Blaze, ma per qualche ragione essa prende forma di uno scudo e non di un'arma. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | LINT | All 23 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=23 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://www.agcscanlation.it/.../1.jpg` (image/jpeg, 874792 bytes, 957x1400) |  |  |  |
