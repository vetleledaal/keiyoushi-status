# Extension Validation Report

- Extension: tachiyomi-th.toomtammanga-v1.4.32
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5640783863041818405
- Source name: ToomTam-Manga
- Source language: th
- Selected manga input: latest offset 0: Reaper of the Drifting Moon | ยมทูตใต้แสงจันทร์ (`.../reaper-of-the-drifting-moon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | The World After the end | โลกหลังการล่มสลาย (`.../the-world-after-the-fall`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Kuro no Shoukanshi (`.../kuro-no-shoukanshi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Reaper of the Drifting Moon | ยมทูตใต้แสงจันทร์ (`.../reaper-of-the-drifting-moon`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Pheromones (`.../pheromones`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Reaper of the Drifting Moon | ยมทูตใต้แสงจันทร์ (`.../reaper-of-the-drifting-moon`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Reaper of the Drifting Moon | ยมทูตใต้แสงจันทร์ (`.../reaper-of-the-drifting-moon`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 114 | ตอนที่ 0 (`.../reaper-of-the-drifting-moon-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reaper of the Drifting Moon \| ยมทูตใต้แสงจันทร์, URL=`.../reaper-of-the-drifting-moon` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../%E0%B8%9B%E0%B8%81-4.jpg <redacted query values: resize>` (image/jpeg, 16469 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../reaper-of-the-drifting-moon` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../%E0%B8%9B%E0%B8%81-4.jpg` (image/jpeg, 234706 bytes, 720x1030) |  |  |  |
| details author | PASS | Mok-in Ugag |  |  |  |
| details artist | PASS | INKYO |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Manhwa, Martial arts, Mystery, Shounen, มังฮวา, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | พโยวอลเป็นเด็กกำพร้าที่พเนจรไปทั่วทวีปจนกระทั่งเขาชนเข้ากับชายลึกลับคนหนึ่งและหมดสติไป เมื่อเขาตื่นขึ้น เขาพบว่าตัวเองอยู่ในที่มืดและคับแคบซึ่งมีประตูเหล็กเพียงบานเดียวสำหรับทางออก โวลเอาชีวิตรอดในอีกหลายเดือนข้างหน้าด้วยความเหน็ดเหนื่อย โดยพยายามใจเย็นและรักษารูปร่างให้ดีอยู่เสมอ เมื่อประตูเหล็กเปิดออกในที่สุด เขาก็พบว่าเขาไม่ใช่คนเดียวที่ตกอยู่ในสถานการณ์ที่น่าสังเวชนี้ กลุ่มคนสวมหน้ากากลักพาตัวเด็ก 300 คนไปฝึกเป็นอาวุธมนุษย์ วอลต้องต่อสู้และฆ่าคนอื่นๆ เพราะผู้ที่แข็งแกร่งที่สุดจะถูกเลือกเพียงไม่กี่คน วอลจะสามารถเป็นหนึ่งในผู้ถูกเลือกและหาทางปลดปล่อยตัวเองจากผู้จับกุมได้หรือไม่?<br><br>Alternative Names: Reaper of the Drifting Moon, 死神漂月, 사신표월 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 114 chapters |  |  |  |
| chapter dates | PASS | 114 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../b3d2e211bf28017f032879fa3e36bc16.jpg` (image/jpeg, 188143 bytes, 1000x1430) |  |  |  |
