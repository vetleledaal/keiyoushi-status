# Extension Validation Report

- Extension: tachiyomi-fr.pornhwafr-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4388148978547727168
- Source name: Pornwha.fr
- Source language: fr
- Selected manga input: latest offset 0: Beautiful Days (`.../beautiful-days`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Lustful Games (`.../lustful-games`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | I Have to Sleep With a Stranger? (`.../i-have-to-sleep-with-a-stranger`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Baiser addictif (`.../baiser-addictif`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 84 | Chapitre 1 (`.../beautiful-days-chapitre-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beautiful Days, URL=`.../beautiful-days` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pornhwa.fr/.../beautiful-days-214x300.webp` (image/webp (encoding: lossy), 10446 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../beautiful-days` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pornhwa.fr/.../beautiful-days.webp` (image/webp (encoding: lossy), 35534 bytes, 600x840) |  |  |  |
| details author | PASS | June |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drame, Erotique, Mature, Pornhwa, Smut, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Des personnes qui vivent en cachant leurs circonstances et leurs désirs individuels en silence, mais qui espèrent qu’un jour ils s’épanouiront. « Je dévoilerai chaque partie de toi – ta peau, ta sueur, ton parfum et tes gémissements… »<br><br>Nom alternatif : 欲にまみれたこの街で, 뷰티풀데이즈 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 84 chapters |  |  |  |
| chapter dates | LINT | All 84 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=84 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s22.yaoiscan.fr/.../001.jpg` (image/jpeg, 1748370 bytes, 800x40664) |  |  |  |
