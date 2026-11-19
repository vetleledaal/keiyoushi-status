# Extension Validation Report

- Extension: tachiyomi-tr.xiaoaitoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3151409498215291942
- Source name: Xiaoaitoon
- Source language: tr
- Selected manga input: popular offset 0: Sahne Arkası (`.../sahne-arkasi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Sahne Arkası (`.../sahne-arkasi`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Unchanged Man (`.../unchanged-man`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sahne Arkası (`.../sahne-arkasi`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sahne Arkası (`.../sahne-arkasi`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | 🔒 Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sahne Arkası, URL=`.../sahne-arkasi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xiaoaitoon.org.tr/.../SCR-20260505-ogld.jpeg` (image/jpeg, 435794 bytes, 956x1276) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sahne-arkasi` |  |  |  |
| details thumbnail URL | PASS | `https://xiaoaitoon.org.tr/.../SCR-20260505-ogld.jpeg` |  |  |  |
| details author | PASS | Kim Gunsu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL, Action, Boys, Drama, Love, Manhwa, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Düzenli ve çalışkan öğrenci imajıyla yaşamaktan bıkmış olan Jinwoo, ilk kez bir kulübe giderek gerçeklerden kaçmaya karar verir. Alkolün etkisiyle kendini kaptırır ve o gece, yeni tanıştığı yakışıklı bir adamla birlikte olur.<br><br>Ertesi sabah, Jinwoo kendini boş bir odada yalnız başına bulur; yatağın ucunda birkaç tane 50.000 wonluk banknot durmaktadır. Kafası karışmış ve sersemlemiş halde, biriyle birlikte olduğu için para aldığını sanır. Bu yanlış anlamayla öfkelenir, ama sonunda yaşananları geride bırakmaya karar verir.<br><br>Dönem başında okula geri döndüğünde, hoobaelerine tiyatro gösterileri için yardım ederken, sahnede tanıdık bir yüzle göz göze gelir: O gece birlikte olduğu, bir daha asla karşılaşacağını düşünmediği adam, *Kwon Taeyoung*.<br><br>Ve tam da o Kwon Taeyoung, herkesin duyabileceği bir mesafede, gözleri parıldayarak şöyle der:<br><br>*“Buldum seni.”*<br><br>**Alternative Names:**<br>- 스테이지 비하인드<br>- Behind the Stage |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
