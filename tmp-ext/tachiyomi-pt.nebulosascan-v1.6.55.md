# Extension Validation Report

- Extension: tachiyomi-pt.nebulosascan-v1.6.55
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1410750574939174515
- Source name: Nebulosa Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: A reencarnação da gansa dourada do alfa dominante (`.../15`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A reencarnação da gansa dourada do alfa dominante (`.../15`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 8 | Caçando Den (`.../301`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | A reencarnação da gansa dourada do alfa dominante (`.../15`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 8 | A teoria da evolução humana – Conto: A caixa silenciosa (`.../294`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A reencarnação da gansa dourada do alfa dominante (`.../15`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A reencarnação da gansa dourada do alfa dominante (`.../15`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 62 | Capítulo 0 (`.../capitulo-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A reencarnação da gansa dourada do alfa dominante, URL=`15` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 67/67 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 67/67 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nebulosascan.com/.../Design_sem_nome-16-350x476.png` (image/png, 94570 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `15` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nebulosascan.com/.../Design_sem_nome-16.png` (image/png, 1419740 bytes, 940x1422) |  |  |  |
| details author | PASS | Image金玉酱 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 18+, Ação, Aventura, Comédia, Danmei (BL), Drama, Kuaichuan, Omegaverso, Romance, Xianxia, ABO, Ativo, Manhua, Reencarnação |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lin Qiu, anteriormente um poderoso líder da máfia, é fatalmente ferido durante um confronto entre gangues. Ao despertar, encontra-se em um mundo alternativo omegaverse, ocupando o corpo de um ômega mantido como amante por um influente alpha. Surpreendido ao acordar ao lado de um homem prestes a se despir, Lin Qiu o domina com suas habilidades de combate. No entanto, percebe que está vestindo lingerie sensual, indicando sua nova identidade como ômega. A trama acompanha sua adaptação a essa realidade e o desenvolvimento do relacionamento com seu “patrocinador” alpha.<br><br>Quer ficar por dentro dos nossos lançamentos? https://t.me/.../nebulosascan<br><br>🔞 Classificação indicativa: +18 Esta obra é destinada a leitores adultos. Pode conter temas fortes, violência gráfica, gore, insinuações sexuais e nudez. Recomendamos discrição e leitura consciente.<br><br>Nomes alternativos: Reencarné en el Gran Ganso Dorado del alfa dominante / 穿成Alpha大佬的金丝大鹅 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 62 chapters |  |  |  |
| chapter dates | LINT | 61 of 62 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=61 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://nebulosascan.com/.../01.webp` (image/webp (container: extended), 616548 bytes, 720x9355) |  |  |  |
