# Extension Validation Report

- Extension: tachiyomi-es.noranofansub-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: foolslide
- Source ID: 7799054035626535709
- Source name: Nora no Fansub
- Source language: es
- Selected manga input: popular offset 0: Boku no Ushiro ni Majo ga Iru (`.../boku-no-ushiro-ni-majo-ga-iru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Boku no Ushiro ni Majo ga Iru (`.../boku-no-ushiro-ni-majo-ga-iru`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Hei Se Hao Men: Ni Chong Xiao Tao Qi (`.../hei-se-hao-men-ni-chong-xiao-tao-qi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 79 | Sirviente Vampiro (`.../sirviente-vampiro`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Boku no Ushiro ni Majo ga Iru (`.../boku-no-ushiro-ni-majo-ga-iru`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boku no Ushiro ni Majo ga Iru (`.../boku-no-ushiro-ni-majo-ga-iru`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 124 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 79 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boku no Ushiro ni Majo ga Iru, URL=`.../boku-no-ushiro-ni-majo-ga-iru` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 130/130 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 129/130 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.noranofansub.com/.../bnu_por1.jpg` (image/jpeg, 289800 bytes, 960x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../boku-no-ushiro-ni-majo-ga-iru` |  |  |  |
| details thumbnail URL | PASS | `https://www.noranofansub.com/.../bnu_por1.jpg` |  |  |  |
| details author | PASS | Yamada Hitsuji |  |  |  |
| details artist | PASS | Yamada Hitsuji |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Nanri Ryusuke ha sido transferido tres veces de escuela este año a causa del divorcio de sus padres y él está decidido a hacer una buena impresión en su nueva escuela, ya que parece que se va a quedar para siempre esta vez. Sin embargo, su puesto se encuentra en frente de la chica rara de la clase, Fujimori Mia, que afirman es una bruja y que todos en la escuela la evitan. Mia, por alguna extraña razón, tiene un interés espeluznante en Ryusuke y lo convierte en el sujeto de todos sus experimentos y hechizos locos. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../nora-no-fansub` at offsets 48, 49, `.../nora-no-fansub` at offsets 66, 67 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.noranofansub.com/.../00.jpg` (image/jpeg, 205661 bytes, 799x1082) |  |  |  |
