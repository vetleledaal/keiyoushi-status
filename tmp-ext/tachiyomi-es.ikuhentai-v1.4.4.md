# Extension Validation Report

- Extension: tachiyomi-es.ikuhentai-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7567013997438852760
- Source name: Ikuhentai
- Source language: es
- Selected manga input: latest offset 0: Otonari no Darashina Onee san ni Nagusamerareru Hanashi (`.../otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Ikura de Yaremasu ka? (`.../ikura-de-yaremasu-ka`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Korekara Onii-chan ni 〇〇〇 Shichaimasu (`.../korekara-onii-chan-ni-%E3%80%87%E3%80%87%E3%80%87-shichaimasu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Otonari no Darashina Onee san ni Nagusamerareru Hanashi (`.../otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Mamá Sumisa (`.../mama-sumisa`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Otonari no Darashina Onee san ni Nagusamerareru Hanashi (`.../otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Otonari no Darashina Onee san ni Nagusamerareru Hanashi (`.../otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Leer Otonari no Darashina Onee san ni Nagusamerareru Hanashi (`.../leer-otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Otonari no Darashina Onee san ni Nagusamerareru Hanashi, URL=`.../otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ikuhentai.net/.../23_a_23-193x278.webp` (image/webp (encoding: lossy), 13892 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi` |  |  |  |
| details thumbnail URL | PASS | `https://ikuhentai.net/.../23_a_23-193x278.webp` |  |  |  |
| details author | PASS | Shouji Nigou |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Grandes Tetas, Mamadas |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Otonari no Darashina Onee san ni Nagusamerareru Hanashi Kazuma es un estudiante universitario que vive al lado de una mujer imprudente que consume alcohol con frecuencia. Nunca había pensado en su vecina como una mujer, pero todo cambió cuando ella lo consoló de manera sexual el día que su pareja lo dejó. Después de eso, Kazuma comienza a cambiar su opinión sobre ella. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ikuhentai.net/.../01_a_1.webp` (image/webp (encoding: lossy), 253964 bytes, 2061x1800) |  |  |  |
