# Extension Validation Report

- Extension: tachiyomi-en.manhuatop-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1903782575226230108
- Source name: ManhuaTop
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../70217`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Martial Peak (`.../70217`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Apex Future Martial Arts (`.../88519`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The General – Fighting Legend (`.../104259`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Lone SSS-Class Summoner (`.../87733`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Martial Peak (`.../70217`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../70217`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3869 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`70217` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuatop.org/.../Martial-Peak-175x238.webp` (image/webp (encoding: lossy), 13934 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `70217` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhuatop.org/.../Martial-Peak.webp` (image/webp (encoding: lossy), 71966 bytes, 720x1018) |  |  |  |
| details author | PASS | Momo (II), Momo (III) |  |  |  |
| details artist | PASS | Momo (II), Pikapi |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Harem, Historical, Manga, Manhwa, Martial Arts, Romance, Sci-fi, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The journey to the martial peak is a lonely, solitary and long one. In the face of adversity, you must survive and remain unyielding. Only then you can breakthrough and continue on your journey to becoming the strongest. High Heaven Pavilion tests its disciples in the harshest ways possible to prepare them for such a journey. One day the lowly sweeper Yang Kai managed to obtain a mysterious black book, setting him on the road to the peak of the martial world.<br><br>The Pinnacle of Martial Arts; Wu Lian Dian Feng; Wu Lian Dianfeng; Wǔ Liàn Diān Fēng; Wǔ Liàn Diānfēng; Вершина боевых искусств; Пик боевых искусств; ذروة الفنون القتالية; مارشال بيك; 武炼巅峰; 武煉巔峰; 武錬天下; 무련전봉<br><br>Alternative Names: The Pinnacle of Martial Arts / Võ Luyện Đỉnh Phong / Wu Lian Dian Feng / Wu Lian Dianfeng / Wǔ Liàn Diān Fēng / Wǔ Liàn Diānfēng / Вершина боевых искусств / Пик боевых искусств / ذروة الفنون القتالية / مارشال بيك / 武炼巅峰 / 武煉巔峰 / 武錬天下 / 무련전봉 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3869 chapters |  |  |  |
| chapter dates | PASS | 3869 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://manhuatop.org/.../about_manhuatop_3.webp` (image/webp (encoding: lossy), 143450 bytes, 800x533) |  |  |  |
