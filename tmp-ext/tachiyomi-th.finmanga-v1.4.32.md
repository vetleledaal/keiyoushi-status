# Extension Validation Report

- Extension: tachiyomi-th.finmanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7656859857051979814
- Source name: Fin Manga
- Source language: th
- Selected manga input: latest offset 0: For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด (`.../for-my-birthday-i-was-gifted-five-husbands`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด (`.../for-my-birthday-i-was-gifted-five-husbands`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด (`.../for-my-birthday-i-was-gifted-five-husbands`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด (`.../for-my-birthday-i-was-gifted-five-husbands`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด (`.../for-my-birthday-i-was-gifted-five-husbands`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด (`.../for-my-birthday-i-was-gifted-five-husbands`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด (`.../for-my-birthday-i-was-gifted-five-husbands`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 33 | ตอนที่ 0 (`.../for-my-birthday-i-was-gifted-five-husbands-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด, URL=`.../for-my-birthday-i-was-gifted-five-husbands` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.fin-manga.com/.../For-My-Birthday-I-Was-Gifted-Five-Husbands.jpg` (image/jpeg, 45776 bytes, 400x530) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../for-my-birthday-i-was-gifted-five-husbands` |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` is not an absolute HTTP(S) URL (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Comedy, Harem, Josei, Mature, Romance, Smut, ตลก, มังงะเกาหลี, ฮาเร็ม, โรแมนติก, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ For My Birthday, I Was Gifted Five Husbands เมื่อฉันได้รับสามีหนุ่มหล่อห้าคนใันวันเกิด มังงะแปลไทย ผลงานเรื่องนี้มีการบรรยายถึงกิจกรรมทางเพศกับบุคคลหลายคน รวมถึงพฤติกรรมทางเพศที่อาจมีความเกินจริง โปรดใช้วิจารณญาณในการอ่าน เพราะความเจ้าชู้ของพ่อ ทำให้แม่ต้องทนทุกข์ทรมานมาตลอดชีวิต จนกระทั่งวาระสุดท้าย แม่ได้ทิ้งคำพูดนี้ไว้ว่า… “ผู้ชายคนเดียวมันไม่พอ… ลูกต้องเจอผู้ชายเยอะๆ ต้องมีพวกเขารายล้อมไว้ให้ได้นะ” ในตอนแรก ‘ยูเจนี นอร์ตัน’ ไม่เคยเก็บคำพูดนั้นมาใส่ใจเลย จนกระทั่งงานศพของแม่จบลง พ่อก็พาสาวน้อยคนใหม่กับลูกติดเข้ามาในบ้าน เธอจึงตกอยู่ในวิกฤตที่กำลังจะถูกแย่งชิงทั้งคู่หมั้นและมรดกทั้งหมดไป ทว่าในวันเกิดครบรอบ 24 ปี… ‘ของขวัญ’ หลายชิ้นที่แม่เตรียมไว้ให้ลูกสาวโดยเฉพาะ ก็ได้ปรากฏตัวขึ้นต่อหน้าเธอ! พี่ชายคนสนิท จากตระกูลพลเรือเอกแห่งภาคใต้ ท่านดยุกแห่งแดนเหนือ วีรบุรุษสงครามของจักรวรรดิ นักธุรกิจหนุ่มรุ่นน้อง ผู้กุมบังเหียนธุรกิจสีเทา ผู้อุปถัมภ์งานศิลปะ คู่ปรับตลอดกาลสมัยเรียนอคาเดมี่ เพื่อนสมัยเด็ก ผู้ดำรงตำแหน่งนักบวชที่โตมาด้วยกัน… และนี่คือเรื่องราวของ ‘ยูเจนี นอร์ตัน’ บัณฑิตสาวธรรมดาๆ ในจักรวรรดิ ที่ต้องกลายมาเป็นผู้ครอบครองและบัญชาการ (หัวใจ) สามีทั้งห้าคน<br><br>Alternative Names: Aparecieron cinco esposos, Cinq maris sont apparus, El día de mi cumpleaños, Five Husbands Appeared on My Birthday, Five Husbands For My Birthday, For My Birthday I Was Gifted Five Husbands, I Received Five Husbands as a Gift on My Birthday, Le jour de mon anniversaire, Năm Người Chồng Xuất Hiện Vào Sinh Nhật Tôi, في يوم ميلادي، ظهر خمسة أزواج, मेरे जन्मदिन पर पाँच पति सामने आए, 出现了五个丈夫, 在我生日那天, 생일날 남편 다섯이 나타났다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | LINT | All 33 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=33 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.fin-manga.com/.../For-My-Birthday-I-Was-Gifted-Five-Husbands-ep0-1.webp` (image/webp (encoding: lossy), 745226 bytes, 1000x8000) |  |  |  |
