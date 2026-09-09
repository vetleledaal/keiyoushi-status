# Extension Validation Report

- Extension: tachiyomi-ca.fansubscat-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fansubscat
- Source ID: 3974404971892520732
- Source name: Fansubs.cat
- Source language: ca
- Selected manga input: latest offset 0: Quedes detingut! (`.../quedes-detingut`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | El noi en què estava interessada no era en cap cas un noi (`.../el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | La Tomo és una noia! (`.../la-tomo-es-una-noia`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Quedes detingut! (`.../quedes-detingut`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | T'he trobat!! (`.../t-he-trobat`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Quedes detingut! (`.../quedes-detingut`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Quedes detingut! (`.../quedes-detingut`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 22 | Volum 1 - Capítol 1: Dones policia explosives sense cap mena de por! (`.../17583`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Quedes detingut!, URL=`quedes-detingut` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.fansubs.cat/.../version_4348.jpg` (image/jpeg, 101330 bytes, 300x430) |  |  |  |
| details identity | PASS | Details preserved selected URL `quedes-detingut` |  |  |  |
| details thumbnail URL | PASS | `https://static.fansubs.cat/.../version_4348.jpg` |  |  |  |
| details author | PASS | Kousuke Fujishima |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acció, Comèdia, Detectivesc, Laboral, Personatges adults, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La Natsumi i la Miyuki són dues agents de l'ordre de Tòquio, al Japó. Cadascuna d'elles amb la seva personalitat, aquesta parella es va fer famosa arran de la seva adaptació animada. Ara, segueix les seves aventures en format manga! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fideusalacassola.xyz/.../001.jpg` (image/jpeg, 917335 bytes, 1114x1600) |  |  |  |
