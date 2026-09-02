# Extension Validation Report

- Extension: tachiyomi-it.digitalteam-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 1
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4450188005228586123
- Source name: DigitalTeam
- Source language: it
- Selected manga input: popular offset 0: Act-Age (`.../act-age`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 80 | Act-Age (`.../act-age`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: La ricerca è momentaneamente disabilitata. | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Act-Age (`.../act-age`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 58 | Volume 1 Capitolo 1: Yonagi Kei (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | ERROR | java.lang.Exception: La ricerca è momentaneamente disabilitata. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 80 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | La ricerca è momentaneamente disabilitata. |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://i.postimg.cc/.../img-mv-01.jpg` -> 5 manga URLs (examples: `.../digimon-knuckles`, `.../digimon-paradox`, `.../digimon-recollection`) |  |  |  |
| thumbnail | PASS | `https://i.postimg.cc/.../act-age.jpg` (image/jpeg, 172874 bytes, 550x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../act-age` |  |  |  |
| details thumbnail URL | PASS | `https://i.postimg.cc/.../act-age.jpg` |  |  |  |
| details author | PASS | Tatsuya Matsuki |  |  |  |
| details artist | PASS | Shiro Usazaki |  |  |  |
| details genres | PASS | Drammatico, Sentimentale, Shonen, Slice Of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Trama: Un regista geniale, Sumiji Kuroyama, è chiamato a presenziare ad un'audizione per giovani attrici emergenti. Nonostante quasi tutte le ragazze presenti gli sembrino banali e prive di talento, il suo sguardo viene all'improvviso catturato da lei: Kei Yonagi, 16 anni e tutto il potenziale di un vero diamante grezzo. Che l'uomo abbia finalmente trovato l'unica attrice nata per realizzare il suo sogno? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 58 chapters |  |  |  |
| chapter dates | PASS | 58 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dgtread.com/.../00_rifirac4d2c29fa7186dca18d.jpg` (image/jpeg, 686291 bytes, 893x1402) |  |  |  |
