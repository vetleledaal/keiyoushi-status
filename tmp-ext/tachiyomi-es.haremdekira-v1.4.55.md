# Extension Validation Report

- Extension: tachiyomi-es.haremdekira-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
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
- Source ID: 1480472727871484054
- Source name: Harem de Kira
- Source language: es
- Selected manga input: popular offset 0: La Villana más Malvada de la Historia (`.../villana-mas-malvada`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | La Villana más Malvada de la Historia (`.../villana-mas-malvada`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Estoy atrapada en un drama terrible (`.../estoy-atrapada-en-un-drama-terrible`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | El juego de supervivencia de la villana (`.../el-juego-de-supervivencia-de-la-villana`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Duquesa Fantasmal (`.../duquesa-fantasmal`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | La Villana más Malvada de la Historia (`.../villana-mas-malvada`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | La Villana más Malvada de la Historia (`.../villana-mas-malvada`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 82 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 86 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La Villana más Malvada de la Historia, URL=`.../villana-mas-malvada` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kiraproject.lat/.../villanaaaaAAA_kirascan.webp` (image/webp (container: extended), 108478 bytes, 600x872) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../villana-mas-malvada` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ¡El duque, que una vez fue un aristócrata soltero y se rumoreaba que era un mujeriego, está siendo derrotado por la mujer más malvada del imperio, que se está acercando a él…! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | LINT | All 82 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=82 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 86 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kiraproject.lat/.../villanama_0.jpeg` (image/jpeg, 193983 bytes, 840x1220) |  |  |  |
